public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void addText(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        if (memento != null) {
            this.text = new StringBuilder(memento.getState());
        }
    }
}