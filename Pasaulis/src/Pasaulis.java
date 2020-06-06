import java.util.ArrayList;
import java.util.List;


public class Pasaulis {

    // pasaulio zmones
    List<Zmogus> zmones = new ArrayList<>();

    // - prideti zmogu i pasauli
    void pridetiZmogu(Zmogus z) {
        zmones.add(z);
    }

    // - sendiname zmones - padidina kiekvieno zmogaus amziu metais
    void sendinameZmones() {
        for (Zmogus zmogus : zmones) {
            zmogus.amzius++;
        }
    }

    void zmonesGimsta() {
        List<Zmogus> naujagimiai = new ArrayList<>();
        for (Zmogus z: zmones) {
            if (z.amzius >= 16 && z.amzius < 50) {
                if (Math.random() < 10/100.) {
                    naujagimiai.add(new Zmogus());
                }
            }
        }
        zmones.addAll(naujagimiai);
    }

    void zudynes() {
        List<Zmogus> kapines = new ArrayList<>();
        for (Zmogus z : zmones) {
            if (z.amzius < 20) {
                if (Math.random() < 0.001 / 100.) {
                    kapines.add(z);
                }
            } else if (z.amzius < 30) {
                if (Math.random() < 10 / 100.) {
                    kapines.add(z);
                }
            } else if (z.amzius < 50) {
                if (Math.random() < 5 / 100.) {
                    kapines.add(z);
                }
            } else {
                if (Math.random() < 25 / 100.) {
                    kapines.add(z);
                }
            }
        }
        zmones.removeAll(kapines);
    }

        // - kiek yra zmoniu
        int kiekYraZmoniu () {
            return zmones.size();
        }

        public static void main (String[]args){
            Pasaulis pasaulis = new Pasaulis();
            Zmogus adomas = new Zmogus();
            Zmogus ieva = new Zmogus();
            pasaulis.pridetiZmogu(adomas);
            pasaulis.pridetiZmogu(ieva);
            pasaulis.sendinameZmones();
            for ( int metai = 0; metai < 500; metai++) {
                pasaulis.sendinameZmones();
                pasaulis.zudynes();
                pasaulis.zmonesGimsta();
                System.out.println("Year " + metai + " Population " + pasaulis.kiekYraZmoniu());
            }
        }

    }