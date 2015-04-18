package controller.action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

import utility.Direction;
import model.behavior.Interactor;
import model.entity.Entity;

public class MoveNorthAction implements Action {

	private Entity entity;
	
	public MoveNorthAction (Entity e) {
		entity = e;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//entity.move(Direction.NORTH);
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
