package com.william.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM_System {
    public static void main(String[] args) {
        // 每个用户的账户信息都是一个对象，需要账户类Account
        // 需要一个容器存储系统全部账户对象的信息 (卡号，姓名，密码，余额，取现额度)
        ArrayList<Account> accounts = new ArrayList<>();

        // 系统首页：登陆和注册两个功能
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==============ATM系统==================");
            System.out.println("1. 账户登陆");
            System.out.println("1. 账户开户");

            System.out.println("请您选择操作：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    // 登陆
                    login(accounts, sc);
                    break;
                case 2:
                    // 开户
                    register(accounts, sc); // alt + enter 自动生成方法
                    break;
                default:
                    System.out.println("您输入的操作命令不存在！");
            }
        }

    }

    /**
     * 登陆功能：根据卡号去账户集合中查询账户对象
     * @param accounts: 全部账户对象集合
     * @param sc: 扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================系统登陆操作===================");
        // 判断账户集合中是否存在账户
        if (accounts.size() == 0){
            System.out.println("当前系统中无认为账户，请先开户！");
            return;
        }

        // 存在账户进入登陆操作
        while (true) {
            System.out.println("请您输入登录卡号：");
            String cardId = sc.next();
            // 根据卡号查询对象，该功能已经由方法实现
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc != null) {
                while (true) {
                    System.out.println("请您输入登录密码：");
                    String password = sc.next();
                    if (acc.getPassword().equals(password)){
                        System.out.println("恭喜您，" + acc.getUserName() + "先生/女士进入系统，您的卡号是：" + acc.getCardId());
                        // 登录后进入用户操作页
                        showUserCommand(sc, acc, accounts);
                        return; // 跳出登陆方法
                    } else {
                        System.out.println("对不起，您输入的密码有误！");
                    }
                }
            } else {
                System.out.println("对不起，系统中不存在该账户卡号！");
            }
        }
    }

    // 展示登录后的操作页
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("==============用户操作页===============");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");

            System.out.println("请选择您需要的业务：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depositMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
                    // 修改密码
                    updatePassword(acc, sc);
                    return;
                case 6:
                    // 退出
                    System.out.println("退出成功！欢迎下次光临");
                    return; // 跳出当前方法，回到首页
                case 7:
                    // 注销账户
                    if (deleteAccount(accounts, acc, sc)) {
                        return; // 销户成功回到首页
                    } else {
                        break; // 没有销户成功，还是回到操作页
                    }
                default:
                    System.out.println("您输入的命令不正确！");

            }
        }
    }

    /**
     * 销户功能
     * @param accounts:账户集合
     * @param acc: 当前账户
     * @param sc: 扫描器
     */
    private static boolean deleteAccount(ArrayList<Account> accounts, Account acc, Scanner sc) {
        System.out.println("=================销户操作====================");
        System.out.println("您确定要销户吗？ Y/N");
        String rs = sc.next();
        switch (rs) {
            case "Y":
                if (acc.getMoney() > 0) {
                    System.out.println("您当前账户中还有余额，不能销户！");
                } else {
                    accounts.remove(acc);
                    System.out.println("您的账户销户完成！");
                    return true;
                }
                break;
            case "N":
                System.out.println("好的当前账户继续保留");
            default:
                System.out.println("好的当前账户继续保留");
        }
        return false;
    }

    /**
     * 修改密码方法
     * @param acc: 当前账户对象
     * @param sc: 扫描器
     */
    private static void updatePassword(Account acc, Scanner sc) {
        System.out.println("=================修改密码====================");
        while (true) {
            System.out.println("请您输入当前密码");

            String password = sc.next();
            if (password.equals(acc.getPassword())){
                while (true) {
                    System.out.println("请您输入新的密码：");
                    String newPassword = sc.next();

                    System.out.println("请您确认新密码：");
                    String okPassword = sc.next();

                    if (newPassword.equals(okPassword)){
                        acc.setPassword(newPassword);
                        System.out.println("密码修改成功！");
                        return;
                    } else {
                        System.out.println("两次输入的密码不一致！");
                    }
                }
            } else {
                System.out.println("您输入的密码不正确！请重试");
            }
        }
    }

    /**
     * 转账功能
     * 需要系统中有两个账户及以上；判断本账户有钱；对方账户要存在，且要验证姓氏
     * @param accounts: 全部账户集合
     * @param acc: 户主账户
     * @param sc: 扫描器
     */
    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        System.out.println("=================转账操作====================");
        if (accounts.size() < 2){
            System.out.println("当前系统中不足两个账户，不能转账");
            return;
        }

        if (acc.getMoney() == 0){
            System.out.println("对不起，您的账户中无余额");
            return;
        }

        while (true) {
            System.out.println("请您输入对方账户的卡号：");
            String cardId = sc.next();
            // 确保卡号不能是自己的
            if (acc.getCardId().equals(cardId)){
                System.out.println("对不起，不能给自己转账！");
                continue; // 结束当次执行，进入下一次
            }

            Account account = getAccountByCardId(cardId, accounts);
            if (account == null){
                System.out.println("对不起，您输入的卡号不存在！");
            } else {
                // 继续认证姓氏
                String userName = account.getUserName();
                // 注意不要使用replace，会导致所有相同的字符被替换
                String tip = "*" + userName.substring(1);

                System.out.println("请您输入 [" + tip + "] 的姓氏");
                String preName = sc.next();

                if (userName.startsWith(preName)){
                    // 认证通过
                    while (true) {
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        if (money > acc.getMoney()) {
                            System.out.println("对不起，您余额不足！您最多可以转账：" + acc.getMoney());
                        } else {
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功！您的账户余额为：" + acc.getMoney());
                            return;
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的姓氏有误！");
                }

            }
        }

    }


    /**
     * 取钱方法
     * @param acc: 当前账户对象
     * @param sc: 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("=================取款操作====================");
        // 判断是否超过100元
        if (acc.getMoney() < 100) {
            System.out.println("对不起您的余额不足100元，不能取款！");
            return;
        }

        while (true) {
            System.out.println("请您输入取款金额");
            double money = sc.nextDouble();

            if (money > acc.getQuotaMoney()){
                System.out.println("对不起，您当前取款金额超过限额，每次限额为：" + acc.getQuotaMoney());
            } else {
                if (money > acc.getMoney()){
                    System.out.println("余额不足，您账户目前的余额是：" + acc.getMoney());
                } else {
                    System.out.println("取款成功！");
                    acc.setMoney(acc.getMoney() - money); // 修改余额
                    showAccount(acc);
                    return; // 退出方法
                }
            }
        }
    }

    /**
     * 存款方法
     * @param acc: 当前账户对象
     * @param sc: 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("=================存款操作====================");
        System.out.println("请您输入存款金额：");
        double money = sc.nextDouble();

        acc.setMoney(acc.getMoney() + money);
        System.out.println("恭喜您，存款成功！当前您的账户的信息如下：");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     * @param acc: 当前账户对象
     */
    private static void showAccount(Account acc) {
        System.out.println("================当前账户信息如下=================");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("姓名：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("取款限额：" + acc.getQuotaMoney());
    }

    /**
     * 用户开户功能：在ArrayList中存入一个新的账户对象的信息
     * Note: 键盘录入姓名，密码，确认密码(需保证两次密码一致)；
     *       生成账号卡号，卡号必须由系统自动生成唯一的8位数字
     * @param accounts: 用户账户对象的集合
     * @param sc: 传入扫描器接收用户输入
     */
    private static void register(ArrayList<Account> accounts, Scanner sc){
        System.out.println("=============系统开户操作===============");
        Account account = new Account();

        // 用户录入信息
        System.out.println("请您输入账户用户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您输入账户密码：");
            String password = sc.next();
            System.out.println("请您再次输入密码：");
            String okpassword = sc.next();

            if (okpassword.equals(password)){
                // 密码正确，可以录入
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次密码输入不一致");
            }
        }

        System.out.println("请您输入账户取款限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户随意一个8位的唯一卡号
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println("恭喜您，" + userName + "先生/女士，开户成功！您的卡号为：" + cardId + "，请妥善保管卡号" );

    }

    /**
     * 为账户生成唯一的8位卡号
     * @param accounts：账户集合
     * @return: 账户卡号
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt();
            }
            // 判断这个8位卡号是否有重复，独立为一个新的方法 getAccountByCardId
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null){
                // 说明cardId是一个新卡号可以使用
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询账户 (设计该功能也能为其他操作兼容)
     * @param cardId: 卡号
     * @param accounts: 全部账户的集合
     * @return: 账户对象 | null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null; // 无该账号存在
    }


}
