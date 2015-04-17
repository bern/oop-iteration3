package application;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import application.display.Display;




public class Game implements Runnable{
	
	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	// way to draw to screen under render
	// eliminates flickering in screen game
	private BufferStrategy bs;
	private Graphics graphic;
	
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		
		
		
	
	}
	//graphics
	private void init(){
		display = new Display(title, width, height);
		
	}
	
	private void tick(){
		
	}
	
	
	//render draws to screen
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		//graphics object to draw graphics to the canvas
		graphic = bs.getDrawGraphics();
		//Draw here TESTing!
		
		graphic.fillRect(0, 0, width, height);
		
		//End draw
		bs.show();
		graphic.dispose();
	
	}
	
	
	public void run(){
		
		init();
		
		while (running){
			tick();
			render();
			
		}
		
		stop();
	}
	
	
	public synchronized void start(){
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	public synchronized void stop(){
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
