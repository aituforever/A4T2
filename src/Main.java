public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        history.save(editor.save());

        history.save(editor.save());
        editor.addText("Hello, ");

        history.save(editor.save());
        editor.addText("World!");

        System.out.println("Current Text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After Undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After Undo 2: " + editor.getText());
    }
}
