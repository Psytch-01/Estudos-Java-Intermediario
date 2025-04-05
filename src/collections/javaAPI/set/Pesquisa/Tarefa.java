package collections.javaAPI.set.Pesquisa;

public class Tarefa {

    private String description;
    private boolean status;

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
