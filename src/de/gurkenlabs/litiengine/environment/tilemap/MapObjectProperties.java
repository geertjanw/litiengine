package de.gurkenlabs.litiengine.environment.tilemap;

public class MapObjectProperties {
  public static final String TEAM = "team";
  public static final String SPRITESHEETNAME = "spritesheetName";
  public static final String COLLISIONBOXWIDTHFACTOR = "collisionboxWidthFactor";
  public static final String COLLISIONBOXHEIGHTFACTOR = "collisionboxHeightFactor";
  public static final String COLLISION = "collision";
  public static final String INDESTRUCTIBLE = "indestructible";
  public static final String MATERIAL = "material";
  public static final String HEALTH = "health";
  public static final String EMITTERTYPE = "emitterType";
  public static final String MOBTYPE = "mobType";  
  public static final String MINAMOUNT = "minAmount";
  public static final String MAXAMOUNT = "maxAmount";
  public static final String LIGHTBRIGHTNESS = "lightBrightness";
  public static final String LIGHTCOLOR = "lightColor";
  public static final String LIGHTSHAPE = "lightShape";
  public static final String SHADOWTYPE = "shadowType";
  public static final String TRIGGERMESSAGE ="triggermessage";
  
  public class TerrainProperties{
    public static final String REFLECTION = "reflection";
    public static final String FRICTION = "friction";
  }
  
  public class DecorMobProperties{
    public static final String BEHAVIOUR = "decormob-behaviour";
    public static final String VELOCITY = "decormob-velocity";
  }
}