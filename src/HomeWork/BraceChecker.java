package HomeWork;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack(text.length());

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (current == '('|| current =='{' || current == '['){
                stack.push(current);
            }
            else  if (current == ')'|| current == '}'|| current ==']'){
                if (stack.isEmpty()){
                    System.out.println("Error: closed " + current + " at " + i + " but nothing was opened.");
                    return;
                }
                char last = stack.pop();
                if (current == ')'&& last != '('||
                    current == '}'&& last !='{'||
                    current == ']'&& last !='['){

                    System.out.println("Error: opened " + last + " but closed " + current + " at " + i);
                    return;
                }
            }
        }
        if (!stack.isEmpty()){
            System.out.println("Error: some brackets were not closed.");
        }else {
            System.out.println("No errors found!");
        }


    }
}
