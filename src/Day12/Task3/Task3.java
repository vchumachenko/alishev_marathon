/**



 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */


package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand kaipa = new MusicBand("Kaipa", 1993);
        MusicBand kaleo = new MusicBand("Kaleo", 1993);
        MusicBand jalisse = new MusicBand("Jalisse", 1988);
        MusicBand jinjer = new MusicBand("Jinjer", 2012);
        MusicBand k3 = new MusicBand("K3", 2022);
        MusicBand kaipa1 = new MusicBand("Kaipa", 2000);
        MusicBand kaizen = new MusicBand("Kaizen", 1997);
        MusicBand jack_u = new MusicBand("Jack U", 2010);
        MusicBand joey = new MusicBand("Joey", 1993);
        MusicBand jjcc = new MusicBand("JJCC", 1988);


        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(k3);
        musicBands.add(kaipa);
        musicBands.add(kaizen);
        musicBands.add(kaleo);
        musicBands.add(jalisse);
        musicBands.add(jinjer);
        musicBands.add(kaipa1);
        musicBands.add(jack_u);
        musicBands.add(joey);
        musicBands.add(jjcc);


        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        List<MusicBand> musicBandAfter2000 = new ArrayList<>();
        for (MusicBand band :
                musicBands) {
            if (band.getYear() > 1999)
                musicBandAfter2000.add(band);
        }
        System.out.println(musicBandAfter2000);





    }
}
