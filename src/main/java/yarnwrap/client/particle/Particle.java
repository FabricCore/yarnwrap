package yarnwrap.client.particle;
public class Particle { public net.minecraft.client.particle.Particle wrapperContained; public Particle(net.minecraft.client.particle.Particle wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public float velocityMultiplier() { return wrapperContained.velocityMultiplier; }
// public void velocityMultiplier(float value) { wrapperContained.velocityMultiplier = value; }
// public boolean ascending() { return wrapperContained.ascending; }
// public void ascending(boolean value) { wrapperContained.ascending = value; }
// public double MAX_SQUARED_COLLISION_CHECK_DISTANCE() { return wrapperContained.MAX_SQUARED_COLLISION_CHECK_DISTANCE; }
// public void MAX_SQUARED_COLLISION_CHECK_DISTANCE(double value) { wrapperContained.MAX_SQUARED_COLLISION_CHECK_DISTANCE = value; }
// public double prevPosY() { return wrapperContained.prevPosY; }
// public void prevPosY(double value) { wrapperContained.prevPosY = value; }
// public float angle() { return wrapperContained.angle; }
// public void angle(float value) { wrapperContained.angle = value; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public float alpha() { return wrapperContained.alpha; }
// public void alpha(float value) { wrapperContained.alpha = value; }
// public float green() { return wrapperContained.green; }
// public void green(float value) { wrapperContained.green = value; }
// public boolean dead() { return wrapperContained.dead; }
// public void dead(boolean value) { wrapperContained.dead = value; }
// public float gravityStrength() { return wrapperContained.gravityStrength; }
// public void gravityStrength(float value) { wrapperContained.gravityStrength = value; }
// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public int maxAge() { return wrapperContained.maxAge; }
// public void maxAge(int value) { wrapperContained.maxAge = value; }
// public float spacingXZ() { return wrapperContained.spacingXZ; }
// public void spacingXZ(float value) { wrapperContained.spacingXZ = value; }
// public double velocityZ() { return wrapperContained.velocityZ; }
// public void velocityZ(double value) { wrapperContained.velocityZ = value; }
// public yarnwrap.client.world.ClientWorld world() { return new yarnwrap.client.world.ClientWorld(wrapperContained.world); }
// public void world(yarnwrap.client.world.ClientWorld value) { wrapperContained.world = value.wrapperContained; }
// public double velocityX() { return wrapperContained.velocityX; }
// public void velocityX(double value) { wrapperContained.velocityX = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public double prevPosZ() { return wrapperContained.prevPosZ; }
// public void prevPosZ(double value) { wrapperContained.prevPosZ = value; }
// public float prevAngle() { return wrapperContained.prevAngle; }
// public void prevAngle(float value) { wrapperContained.prevAngle = value; }
// public double prevPosX() { return wrapperContained.prevPosX; }
// public void prevPosX(double value) { wrapperContained.prevPosX = value; }
// public float blue() { return wrapperContained.blue; }
// public void blue(float value) { wrapperContained.blue = value; }
// public yarnwrap.util.math.Box EMPTY_BOUNDING_BOX() { return new yarnwrap.util.math.Box(wrapperContained.EMPTY_BOUNDING_BOX); }
// public void EMPTY_BOUNDING_BOX(yarnwrap.util.math.Box value) { wrapperContained.EMPTY_BOUNDING_BOX = value.wrapperContained; }
// public float red() { return wrapperContained.red; }
// public void red(float value) { wrapperContained.red = value; }
// public boolean collidesWithWorld() { return wrapperContained.collidesWithWorld; }
// public void collidesWithWorld(boolean value) { wrapperContained.collidesWithWorld = value; }
// public int age() { return wrapperContained.age; }
// public void age(int value) { wrapperContained.age = value; }
// public float spacingY() { return wrapperContained.spacingY; }
// public void spacingY(float value) { wrapperContained.spacingY = value; }
// public double velocityY() { return wrapperContained.velocityY; }
// public void velocityY(double value) { wrapperContained.velocityY = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public yarnwrap.util.math.Box boundingBox() { return new yarnwrap.util.math.Box(wrapperContained.boundingBox); }
// public void boundingBox(yarnwrap.util.math.Box value) { wrapperContained.boundingBox = value.wrapperContained; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
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