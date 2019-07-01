package employees;

import java.util.Map;

public class NameConverter {

    public String convertName(String name) {
        var pairs = Map.of('á', 'a', 'é', 'e', 'í', 'i', 'ó', 'o', 'ö', 'o',
                'ő', 'o','ú', 'u', 'ü', 'u', 'ű', 'u');
        var result = name.toLowerCase();
        var woAcutes = new StringBuilder();
        for (var c: result.toCharArray()) {
            woAcutes.append(pairs.getOrDefault(c, c));
        }
        return woAcutes.toString();
    }
}
