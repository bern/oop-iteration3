package model.behavior;

import javax.swing.Action;

import model.entity.Entity;
import model.item.Item;
import model.map.AreaEffect;
import model.map.Terrain;

public class Behavior {
	private EntityInteraction entityInteract;
	private ItemInteraction itemInteract;
	private AreaEffectInteraction areaEffectInteract;
	private TerrainInteraction terrainInteract;
	
	public Behavior (EntityInteraction entityInteract, ItemInteraction itemInteract, AreaEffectInteraction areaEffectInteract, TerrainInteraction terrainInteract) {
		this.entityInteract = entityInteract;
		this.itemInteract = itemInteract;
		this.areaEffectInteract = areaEffectInteract;
		this.terrainInteract = terrainInteract;
	}
	
	public EntityInteraction getEntityInteract() {
		return entityInteract;
	}
	public void setEntityInteract(EntityInteraction entityInteract) {
		this.entityInteract = entityInteract;
	}
	public ItemInteraction getItemInteract() {
		return itemInteract;
	}
	public void setItemInteract(ItemInteraction itemInteract) {
		this.itemInteract = itemInteract;
	}
	public AreaEffectInteraction getAreaEffectInteract() {
		return areaEffectInteract;
	}
	public void setAreaEffectInteract(AreaEffectInteraction areaEffectInteract) {
		this.areaEffectInteract = areaEffectInteract;
	}
	public TerrainInteraction getTerrainInteract() {
		return terrainInteract;
	}
	public void setTerrainInteract(TerrainInteraction terrainInteract) {
		this.terrainInteract = terrainInteract;
	}
	
	public Action interactWith(Terrain t) {
		return terrainInteract.interactWith(t);
	}
	
	public Action interactWith(Item i) {
		return itemInteract.interactWith(i);
	}
	
	public Action interactWith(Entity e) {
		return entityInteract.interactWith(e);
	}
	
	public Action interactWith(AreaEffect ae) {
		return areaEffectInteract.interactWith(ae);
	}
	
	
}
