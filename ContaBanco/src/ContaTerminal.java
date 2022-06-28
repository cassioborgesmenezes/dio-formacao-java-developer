import tech.cbm.dio.banco.ContaTerminalController;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaTerminalController controller = new ContaTerminalController();

		controller.getDadosFromTerminal();
		controller.printMessage();
    }
}
