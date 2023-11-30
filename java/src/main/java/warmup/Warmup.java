package warmup;

public class Warmup {
    public void StringsPractice(String text) {
        print("String: " + text);
        int index = 2;
        print("Remove string at index: " + index);
        String c = String.valueOf(text.charAt(index));
        print(c);
        print("Get the unicode code point at the index.");
        int code = text.codePointAt(index);
        print(String.valueOf(code));

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("c");
        stringBuffer.append("a");
        stringBuffer.append("t");

        print("String buffer, creating cat.");
        print(stringBuffer.toString());

        String text2 = "DoggyBusiness";
        int lText1 = text.length();
        int lText2 = text2.length();

        String ss = text2.substring(0, lText1);
        if (ss.equals(text)) {
            print("text1 IS substring of text2");
        }
    }


    public int[] sort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                int curr = items[i];
                int check = items[j];
                if (curr <= check) {
                    items[j] = curr;
                    items[i] = check;
                }
            }
        }
        return items;
    }

    private void print(String text) {
        System.out.println(text);
    }
}
