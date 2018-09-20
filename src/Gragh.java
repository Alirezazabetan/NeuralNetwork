
import java.util.ArrayList;

public class Gragh {
    private ArrayList<Neuron> neurons;
    private int numberOfNeuron;

    public ArrayList<Neuron> getNeurons() {
        return neurons;
    }

    public Gragh(int numberOfNeuron) {
        this.numberOfNeuron = numberOfNeuron;
        neurons = new ArrayList<Neuron>(numberOfNeuron);
    }

    public void addNeuron(Neuron neuron){
        neurons.add(neuron);
    }
    public Neuron getNeuron(int index){
        return neurons.get(index);
    }

    public void setBridge(Neuron neuronS,Neuron neuronE) {
            neuronS.setBridge(neuronE);
    }

    public void showconnections() {
        for (Neuron t:neurons) {
            t.showConnections();
        }
    }
}
