package sg.com.bank.digital.number.constants;

public enum State {
	OFF(0), ON(1);
	
	public final int state;
	 
    private State(int state) {
        this.state = state;
    }
}
