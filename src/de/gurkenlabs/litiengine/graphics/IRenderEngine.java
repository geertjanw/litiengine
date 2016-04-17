/***************************************************************
 * Copyright (c) 2014 - 2015 , gurkenlabs, All rights reserved *
 ***************************************************************/
package de.gurkenlabs.litiengine.graphics;

import java.awt.Graphics2D;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import de.gurkenlabs.litiengine.entities.IEntity;
import de.gurkenlabs.tiled.tmx.IMap;
import de.gurkenlabs.tiled.tmx.MapOrientation;
import de.gurkenlabs.tiled.tmx.utilities.IMapRenderer;

/**
 * The Interface IGraphicsEngine.
 */
public interface IRenderEngine {

  public IMapRenderer getMapRenderer(MapOrientation orientation);
  
  public void entityRenderingCondition(Predicate<RenderEvent<IEntity>> predicate);

  public void onEntityRendering(Consumer<RenderEvent<IEntity>> entity);

  public void onEntityRendered(Consumer<RenderEvent<IEntity>> entity);

  public void onMapRendered(Consumer<RenderEvent<IMap>> map);

  public void render(Graphics2D g, List<? extends IRenderable> renderables);

  public void render(Graphics2D g, List<? extends IRenderable> renderables, IVision vision);

  public void renderEntities(Graphics2D g, List<? extends IEntity> entities);

  public void renderEntities(Graphics2D g, List<? extends IEntity> entities, IVision vision);

  public void render(Graphics2D g, IRenderable renderable);

  public void renderEntity(Graphics2D g, IEntity entity);

  /**
   * Render map.
   *
   * @param g
   *          the g
   */
  public void renderMap(Graphics2D g, final IMap map);
}
