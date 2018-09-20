import java.util.LinkedList;

public class Neuron {

    private LinkedList<Neuron> bridge = new LinkedList();
    private String name;


    public Neuron(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBridge(Neuron neuron) {
        if (this != neuron)
            bridge.add(neuron);
        else
            System.out.println("dublicate neuron!");
    }

    public void showConnections (){

        for (Neuron t: bridge) {
            System.out.println(this.getName()+ " ----> "+t.getName());
        }
    }
}

