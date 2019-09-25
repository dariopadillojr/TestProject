package sg.com.bank.digital.number.constants;

public enum Line {
	VERTICAL("|"),
	HORIZONTAL("─");
	
	public final String line;
	 
    private Line(String label) {
        this.line = label;
    }
}
