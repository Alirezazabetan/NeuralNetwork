
public class TestNeuron {

    public static void main(String[] args) {
        Gragh gr = new Gragh(7);
        gr.addNeuron (new Neuron("N1"));
        gr.addNeuron (new Neuron("N2"));
        gr.addNeuron (new Neuron("N3"));

        gr.setBridge(gr.getNeuron(0),gr.getNeuron(1));
        gr.setBridge(gr.getNeuron(0),gr.getNeuron(2));
        gr.setBridge(gr.getNeuron(1),gr.getNeuron(0));
        gr.setBridge(gr.getNeuron(2),gr.getNeuron(0));
        gr.setBridge(gr.getNeuron(2),gr.getNeuron(1));

        gr.showconnections();


    }
}
