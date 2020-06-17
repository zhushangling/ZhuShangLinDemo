package cn.tedu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {
    public static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            //线程池 提交任务
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    //创建一个自己对象，并调用下面的date方法
                    String date = new ThreadLocalDemo().date(finalI);
                    System.out.println(date);
                }
            });
        }
        threadPool.shutdown();
    }

    /**
     *传入一个int类型的数进来，转为一个格式化的时间字符串
     */
    public String date(int seconds) {
        Date date = new Date(1000 * seconds);
        //这样使用SimpleDateFormat，就是线程安全的了
        SimpleDateFormat simpleDateFormat = ThreadSafeFormatter.dateFormatThreadLocal.get();
        return simpleDateFormat.format(date);
    }
}

/**
 * 匿名内部类
 * 使用ThreadLocal将线程不安全的SimpleDateFormat变成线程安全的
 */
class ThreadSafeFormatter {
    //创建一份 SimpleDateFormat 对象
    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new
            ThreadLocal<SimpleDateFormat>(){
                @Override
                protected SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                }
            };
}
