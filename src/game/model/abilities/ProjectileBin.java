/*
 * Iteration three son!
 */
package game.model.abilities;

import game.Game;
import game.model.entity.Entity;
import game.model.game_world.GameWorld;
import game.util.Location;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aidan
 */
public class ProjectileBin {
    private List<Projectile> projectiles;
    
    public ProjectileBin() {
        projectiles = new ArrayList<Projectile>();
    }
    
    public void addProjectile(Projectile p) {
        projectiles.add(p);
    }
    
    public void removeProjectile(Projectile p) {
        for(int i = projectiles.size() - 1; i >= 0; i++) {
            if(projectiles.get(i) == p) projectiles.remove(i);
        }
    }
    
    public Projectile getProjectileAt(Location l) {
        for(int i = projectiles.size() - 1; i >= 0; i++) {
            if(projectiles.get(i).getLocation().equals(l)) return projectiles.get(i);
        }
        
        return null;
    }
    
    public void update() {
          for(int i = projectiles.size() - 1; i >= 0; i++) {
                Projectile working = projectiles.get(i);
                
                if(working.canMove()) {
                    Location moveTo = working.getLocation().dir(working.getDirection());
                    Projectile proj_collide = getProjectileAt(moveTo);
                    if(proj_collide != null) {
                        removeProjectile(proj_collide);
                        removeProjectile(working);
                        continue;
                    }
                    
                    /*
                    Entity ent_collide = Game.getInstance().getActiveWorld().getEntityAt(moveTo);
                    if(ent_collide != null) {
                        removeProjectile(working);
                        working.onHit(ent_collide);
                        continue;
                    }
                    */
                    
                    working.setLocation(moveTo);
                }
            }
    }
}
