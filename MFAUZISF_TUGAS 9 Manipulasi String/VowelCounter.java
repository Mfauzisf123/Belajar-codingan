public class VowelCounter {
    public static void main(String[] args) {
        String Kalimat = "Fauzi ganteng pisan euyyy";
        int jumlahvocal= countVowels(Kalimat);
        System.out.println("Jumlah huruf vocal:" + jumlahvocal);
    }

    public static int countVowels(String input){
        int count = 0;
        for (char c :
    input.toLowerCase().toCharArray()){
        if ("aiueo".indexOf(c) !=-1) {
            count++;
        }
    }
    return count;
 }
    
}
