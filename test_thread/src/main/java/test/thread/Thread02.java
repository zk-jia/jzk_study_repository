package test.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Thread02 extends Thread{
    // 请求的地址
    private String url;
    // 保存的网络名称
    private String imgName;

    public Thread02(String url,String imgName){
        this.imgName = imgName;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    // 下载图片执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,imgName);
        System.out.println("下载了名为"+imgName+"的图片");

    }

    public static void main(String[] args) {
        Thread02 thread01 = new Thread02("https://image.baidu.com/search/detail?z=0&word=%E5%9F%8E%E5%B8%82%E5%BB%BA%E7%AD%91%E6%91%84%E5%BD%B1%E4%B8%93%E9%A2%98&hs=0&pn=1&spn=0&di=&pi=3978&tn=baiduimagedetail&is=&ie=utf-8&oe=utf-8&cs=4198287529%2C2774471735&os=&simid=&adpicid=0&lpn=0&fr=albumsdetail&fm=&ic=0&sme=&cg=&bdtype=&oriquery=&objurl=https%3A%2F%2Ft7.baidu.com%2Fit%2Fu%3D4198287529%2C2774471735%26fm%3D193%26f%3DGIF&fromurl=ipprf_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bejj6_z%26e3Bv54AzdH3Fri5p5AzdH3F890n80nmb%3F7p4_f576vj%3Dkwt17%267p4_4j1t74%3Dt4w2jfjw6vi%26vit1%3Dlad&gsm=0&islist=&querylist=&album_tab=%E5%BB%BA%E7%AD%91&album_id=7","01.jpg");
        Thread02 thread02 = new Thread02("https://image.baidu.com/search/detail?z=0&word=%E5%9F%8E%E5%B8%82%E5%BB%BA%E7%AD%91%E6%91%84%E5%BD%B1%E4%B8%93%E9%A2%98&hs=0&pn=1&spn=0&di=&pi=3978&tn=baiduimagedetail&is=&ie=utf-8&oe=utf-8&cs=4198287529%2C2774471735&os=&simid=&adpicid=0&lpn=0&fr=albumsdetail&fm=&ic=0&sme=&cg=&bdtype=&oriquery=&objurl=https%3A%2F%2Ft7.baidu.com%2Fit%2Fu%3D4198287529%2C2774471735%26fm%3D193%26f%3DGIF&fromurl=ipprf_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bejj6_z%26e3Bv54AzdH3Fri5p5AzdH3F890n80nmb%3F7p4_f576vj%3Dkwt17%267p4_4j1t74%3Dt4w2jfjw6vi%26vit1%3Dlad&gsm=0&islist=&querylist=&album_tab=%E5%BB%BA%E7%AD%91&album_id=7","02.jpg");
        Thread02 thread03 = new Thread02("https://image.baidu.com/search/detail?z=0&word=%E5%9F%8E%E5%B8%82%E5%BB%BA%E7%AD%91%E6%91%84%E5%BD%B1%E4%B8%93%E9%A2%98&hs=0&pn=1&spn=0&di=&pi=3978&tn=baiduimagedetail&is=&ie=utf-8&oe=utf-8&cs=4198287529%2C2774471735&os=&simid=&adpicid=0&lpn=0&fr=albumsdetail&fm=&ic=0&sme=&cg=&bdtype=&oriquery=&objurl=https%3A%2F%2Ft7.baidu.com%2Fit%2Fu%3D4198287529%2C2774471735%26fm%3D193%26f%3DGIF&fromurl=ipprf_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bejj6_z%26e3Bv54AzdH3Fri5p5AzdH3F890n80nmb%3F7p4_f576vj%3Dkwt17%267p4_4j1t74%3Dt4w2jfjw6vi%26vit1%3Dlad&gsm=0&islist=&querylist=&album_tab=%E5%BB%BA%E7%AD%91&album_id=7","03.jpg");
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class WebDownloader{
    // 下载方法
    public void downloader(String url,String imgName){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(imgName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出错");
        }
    }

}
