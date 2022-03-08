package com.william.cases;

/* 需求：用面向对象编程完成电影信息的展示案例
   "《长津湖》", 9.7, "吴京"
   "《我和我的父辈》", 9.6, "吴京"
   "《扑水少年》", 9.5, "王川"
*/
public class FilmDemo {
    public static void main(String[] args) {
        // 创建三个电影对象, 定义一个Movie类型的数组装3部电影
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("《长津湖》", 9.7, "吴京");
        movies[1] = new Movie("《我和我的父辈》", 9.6, "吴京");
        movies[2] = new Movie("《扑水少年》", 9.5, "王川");

        // 遍历来展示电影信息
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名" + m.getName());
            System.out.println("得分" + m.getScore());
            System.out.println("主演" + m.getActor());
            System.out.println("----------------------------");
        }
    }
}
