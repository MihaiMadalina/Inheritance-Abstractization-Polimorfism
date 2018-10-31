public class Multime {

    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        n = 0;
        int[] date = new int [10];
        dim = 10;
    }

    public Multime(int dim) {
        this.dim = dim;
        date = new int[dim];
    }

    public void adauga(int number) {
        if(n == dim){
            System.out.println("Error: Array is full!");
        }
        boolean isThere = false;

        for (int i = 0; i < n; i++) {
            if (number == date[i]) {
                isThere = true;
            }
        }
        date[n] = number;
         n++;
    }

    public void extrage(int number){
        boolean isThere = false;
        int pozitie = 0;
        for (int i = 0; i < n; i++) {
            if(number == date[i]){
                pozitie = i;
                isThere = true;
            }
        }
        if(isThere == true){
            for(int i = pozitie; i < n-1; i++){ // find the element
                date[i] = date[i+1]; // shift elements
            }
            date[n-1] = 0; // reset the element on the last index
            n--;
        }
    }

        public void afisare () {
            System.out.println("Multimea este: ");
            for (int i = 0; i < n; i++) {
                System.out.print(date[i] + " ");
            }
            System.out.println();
        }
    }


