package sg.com.bank.digital.number.model;

import java.util.HashMap;

import sg.com.bank.digital.number.constants.Line;
import sg.com.bank.digital.number.constants.Side;
import sg.com.bank.digital.number.constants.State;

public class DigitModel {
	private HashMap<Side, State> stateMap = new HashMap<Side, State>();
	private static final HashMap<Side, Line> lineMap = new HashMap<Side, Line>();
	
	public DigitModel() {
		initialize(State.OFF);
	}
	
	public DigitModel(State initialState) {
		initialize(initialState);
	}
	
	private void initialize(State initialState) {
		initLineMap();
		initStateMap(initialState);
	}
	
	private void initLineMap() {
		// initialize the line each side
		lineMap.put(Side.TOP, Line.HORIZONTAL);
		lineMap.put(Side.TOPLEFT, Line.VERTICAL);
		lineMap.put(Side.TOPRIGHT, Line.VERTICAL);
		lineMap.put(Side.MIDDLE, Line.HORIZONTAL);
		lineMap.put(Side.BOTTOMLEFT, Line.VERTICAL);
		lineMap.put(Side.BOTTOMRIGHT, Line.VERTICAL);
		lineMap.put(Side.BOTTOM, Line.HORIZONTAL);
	}
	
	private void initStateMap(State initialState) {
		// initialize the state(ON/OFF) of each side
		stateMap.put(Side.TOP, initialState);
		stateMap.put(Side.TOPLEFT, initialState);
		stateMap.put(Side.TOPRIGHT, initialState);
		stateMap.put(Side.MIDDLE, initialState);
		stateMap.put(Side.BOTTOMLEFT, initialState);
		stateMap.put(Side.BOTTOMRIGHT, initialState);
		stateMap.put(Side.BOTTOM, initialState);
	}
	
	public HashMap<Side, State> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<Side, State> stateMap) {
		this.stateMap = stateMap;
	}

	public HashMap<Side, Line> getLineMap() {
		return lineMap;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(stateMap.toString());
		
		return sb.toString();
	}
	
	
	
}
