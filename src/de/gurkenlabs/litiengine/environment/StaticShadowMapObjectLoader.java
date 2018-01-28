package de.gurkenlabs.litiengine.environment;

import java.util.Collection;

import de.gurkenlabs.litiengine.entities.IEntity;
import de.gurkenlabs.litiengine.environment.tilemap.IMapObject;
import de.gurkenlabs.litiengine.environment.tilemap.MapObjectProperty;
import de.gurkenlabs.litiengine.environment.tilemap.MapObjectType;
import de.gurkenlabs.litiengine.environment.tilemap.StaticShadow;
import de.gurkenlabs.litiengine.environment.tilemap.StaticShadow.StaticShadowType;

public class StaticShadowMapObjectLoader extends MapObjectLoader {

  protected StaticShadowMapObjectLoader() {
    super(MapObjectType.STATICSHADOW);
  }

  @Override
  public Collection<IEntity> load(IMapObject mapObject) {
    if (MapObjectType.get(mapObject.getType()) != MapObjectType.STATICSHADOW) {
      throw new IllegalArgumentException("Cannot load a mapobject of the type " + mapObject.getType() + " with a loader of the type " + MapAreaMapObjectLoader.class);
    }

    Collection<IEntity> entities = super.load(mapObject);
    StaticShadowType type = StaticShadowType.get(mapObject.getCustomProperty(MapObjectProperty.SHADOW_TYPE));
    int offset = mapObject.getCustomPropertyInt(MapObjectProperty.SHADOW_OFFSET, StaticShadow.DEFAULT_OFFSET);

    StaticShadow shadow = new StaticShadow(mapObject.getId(), mapObject.getName(), mapObject.getX(), mapObject.getY(), mapObject.getDimension().width, mapObject.getDimension().height, type);
    shadow.setOffset(offset);
    entities.add(shadow);
    return entities;
  }
}