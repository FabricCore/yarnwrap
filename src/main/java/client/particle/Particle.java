package yarnwrap.client.particle;
public class Particle { public net.minecraft.client.particle.Particle wrapperContained; public Particle(net.minecraft.client.particle.Particle wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean stopped() { return wrapperContained.stopped; }
// public float velocityMultiplier() { return wrapperContained.velocityMultiplier; }
// public boolean ascending() { return wrapperContained.ascending; }
// public double MAX_SQUARED_COLLISION_CHECK_DISTANCE() { return wrapperContained.MAX_SQUARED_COLLISION_CHECK_DISTANCE; }
// public double prevPosY() { return wrapperContained.prevPosY; }
// public float angle() { return wrapperContained.angle; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public float alpha() { return wrapperContained.alpha; }
// public float green() { return wrapperContained.green; }
// public boolean dead() { return wrapperContained.dead; }
// public float gravityStrength() { return wrapperContained.gravityStrength; }
// public boolean onGround() { return wrapperContained.onGround; }
// public int maxAge() { return wrapperContained.maxAge; }
// public float spacingXZ() { return wrapperContained.spacingXZ; }
// public double velocityZ() { return wrapperContained.velocityZ; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public double velocityX() { return wrapperContained.velocityX; }
// public double y() { return wrapperContained.y; }
// public double prevPosZ() { return wrapperContained.prevPosZ; }
// public float prevAngle() { return wrapperContained.prevAngle; }
// public double prevPosX() { return wrapperContained.prevPosX; }
// public float blue() { return wrapperContained.blue; }
// public yarnwrap.util.math.Box EMPTY_BOUNDING_BOX() { return new yarnwrap.util.math.Box(wrapperContained.EMPTY_BOUNDING_BOX); }
// public float red() { return wrapperContained.red; }
// public boolean collidesWithWorld() { return wrapperContained.collidesWithWorld; }
// public int age() { return wrapperContained.age; }
// public float spacingY() { return wrapperContained.spacingY; }
// public double velocityY() { return wrapperContained.velocityY; }
// public double z() { return wrapperContained.z; }
// public yarnwrap.util.math.Box boundingBox() { return new yarnwrap.util.math.Box(wrapperContained.boundingBox); }
// public double x() { return wrapperContained.x; }
public yarnwrap.client.particle.ParticleTextureSheet getType() { return new yarnwrap.client.particle.ParticleTextureSheet(wrapperContained.getType()); }
public void setPos(double x,double y,double z) { wrapperContained.setPos(x,y,z); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
public void setBoundingBox(yarnwrap.util.math.Box boundingBox) { wrapperContained.setBoundingBox(boundingBox.wrapperContained); }
// public int getBrightness(float tint) { return wrapperContained.getBrightness(tint); }
public void move(double dx,double dy,double dz) { wrapperContained.move(dx,dy,dz); }
public void tick() { wrapperContained.tick(); }
// public void repositionFromBoundingBox() { wrapperContained.repositionFromBoundingBox(); }
public void buildGeometry(yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.client.render.Camera camera,float tickDelta) { wrapperContained.buildGeometry(vertexConsumer.wrapperContained,camera.wrapperContained,tickDelta); }
public yarnwrap.client.particle.Particle move(float speed) { return new yarnwrap.client.particle.Particle(wrapperContained.move(speed)); }
public void setMaxAge(int maxAge) { wrapperContained.setMaxAge(maxAge); }
// public void setBoundingBoxSpacing(float spacingXZ,float spacingY) { wrapperContained.setBoundingBoxSpacing(spacingXZ,spacingY); }
public int getMaxAge() { return wrapperContained.getMaxAge(); }
// public void setAlpha(float alpha) { wrapperContained.setAlpha(alpha); }
public void setColor(float red,float green,float blue) { wrapperContained.setColor(red,green,blue); }
public void markDead() { wrapperContained.markDead(); }
public boolean isAlive() { return wrapperContained.isAlive(); }
public yarnwrap.client.particle.Particle scale(float scale) { return new yarnwrap.client.particle.Particle(wrapperContained.scale(scale)); }
public java.util.Optional getGroup() { return wrapperContained.getGroup(); }
public void setVelocity(double velocityX,double velocityY,double velocityZ) { wrapperContained.setVelocity(velocityX,velocityY,velocityZ); }

}