public class Main {
    public static void main(String[] args) {
        String text = "На следующей неделе ожидается более теплая и солнечная погода, поэтому температура воды в водоемах может повыситься на градус, прогнозируют синоптики.";

        String[] words= text.split(" ");
        System.out.println(words.length);
    }
}


