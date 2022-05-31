import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final String TEXT = "Но высокое качество позиционных исследований играет определяющее значение для модели развития! " +
                "А также сторонники тоталитаризма в науке, превозмогая сложившуюся непростую экономическую ситуацию, подвергнуты " +
                "целой серии независимых исследований. " +
                "Таким образом, сплочённость команды профессионалов предопределяет высокую востребованность " +
                "новых предложений. В рамках спецификации современных стандартов, действия представителей " +
                "оппозиции призывают нас к новым свершениям, которые, в свою очередь, " +
                "должны быть своевременно верифицированы.";

        Dict dict = String :: toLowerCase;
        System.out.println(dict.result("DSADsa"));

        List<String> words = getWordsForDict(Arrays.stream(TEXT.split(" ")).toList(), dict);
        for (String word: words) {
            System.out.println(word);
        }
    }


    public static List<String> getWordsForDict (List<String> wordList, Dict dict){
        return wordList.stream()
                .map(dict::result)
                .sorted(Comparator.comparing(dict::result))
                .distinct()
                .collect(Collectors.toList());

    }
}
