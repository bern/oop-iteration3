/*
 * Iteration three son!
 */
package game.model.abilities;

/**
 *
 * @author Aidan
 */
public class ProjectileBin {
    private Projectile[][] projectiles;
    
    public ProjectileBin() {
        emptyProjectiles(10, 10);
    }
    
    public ProjectileBin(int x, int y) {
        emptyProjectiles(Math.max(x, 1), Math.max(y, 1));
    }
    
    public final void emptyProjectiles(int x, int y) {
        projectiles = new Projectile[x][y];
    }
    
    public void addProjectile(Projectile p, int x, int y) {
        if(x >= 0 && x < projectiles.length && y >= 0 && y < projectiles[0].length) {
            projectiles[x][y] = p;
        }
    }
    
    public void removeProjectile(Projectile p) {
        for(int i = 0; i < projectiles.length; i++) {
            for(int j = 0; j < projectiles[0].length; j++) {
                if(projectiles[i][j] == p) projectiles[i][j] = null;
            }
        }
    }
    
    public void removeProjectile(int x, int y) {
        if(x >= 0 && x < projectiles.length && y >= 0 && y < projectiles[0].length) {
            projectiles[x][y] = null;
        }
    }
    
    public void update() {
         for(int i = 0; i < projectiles.length; i++) {
            for(int j = 0; j < projectiles[0].length; j++) {
                Projectile working = projectiles[i][j];
                if(working != null) {
                    if(working.canMove()) {
                        int x = i + working.getDirection().getX();
                        int y = j + working.getDirection().getY();
                        
                        projectiles[i][j] = null;
                        
                        if(projectiles[x][y] != null) projectiles[x][y] = null;
                        else projectiles[x][y] = working;
                    }
                }
            }
        }
    }
}
