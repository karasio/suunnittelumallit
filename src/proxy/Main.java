package proxy;

import java.util.ArrayList;
import java.util.List;

/*
12.	Proxy: Laajenna Wikipediassa olevan Proxy-esimerkkiä
http://en.wikipedia.org/wiki/Proxy_pattern siten, että lisäät
Image-rajapintaan showData()-metodin, joka näyttää kuvan nimen.
Lisää pääohjelmaan valokuvakansio (esim. List-rakenne),
johon lisäät valokuvia proxyinä. Tulosta pääohjelmassa tiedot
valokuvakansion sisällöstä (kuvia ei ladata). Esitä myös kuinka
valokuvakansiota voidaan selata (kuvat ladataan, ellei vielä
ole ladattu).
 */
public class Main {
    public static void main ( final String[] arguments){
        List<Image> photoAlbum = new ArrayList<>();

        System.out.println("Creating photoalbum and printing its contents:");
        for (int i = 0; i < 8; i++) {
            Image image = new ProxyImage("image"+i);
            photoAlbum.add(image);
            System.out.println(image.showData());
        }

        System.out.println("Browsing through photo album");
        for(Image i : photoAlbum) {
            i.displayImage();
        }

        System.out.println("Browsing photo album backwards");
        for (int i = photoAlbum.size()-1; i >= 0; i--) {
            photoAlbum.get(i).displayImage();
        }


    }
}
