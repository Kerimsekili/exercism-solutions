import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {

boolean kebab = false;
        StringBuilder builder = new StringBuilder();
        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                kebab = true;
                continue;
            }
            char out;
            switch (c) {
                case ' ' -> out = '_';
                case '4' -> out = 'a';
                case '3' -> out = 'e';
                case '0' -> out = 'o';
                case '1' -> out = 'l';
                case '7' -> out = 't';
                default -> {
                    if ((c < 'a' || c >= 'z') && (c < 'A' || c > 'Z')) continue;
                    out = kebab ? Character.toUpperCase(c) : c;
                }
            }
            builder.append(out);
            kebab = false;
        }
        return builder.toString();
    }
}
