package yarnwrap.network.packet.c2s.play;
public class PlayerMoveC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained; public PlayerMoveC2SPacket(net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public float yaw() { return wrapperContained.yaw; }
// public void yaw(float value) { wrapperContained.yaw = value; }
// public boolean changeLook() { return wrapperContained.changeLook; }
// public void changeLook(boolean value) { wrapperContained.changeLook = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public boolean changePosition() { return wrapperContained.changePosition; }
// public void changePosition(boolean value) { wrapperContained.changePosition = value; }
// public boolean onGround() { return wrapperContained.onGround; }
// public void onGround(boolean value) { wrapperContained.onGround = value; }
// public PlayerMoveC2SPacket(double x,double y,double z,float yaw,float pitch,boolean onGround,boolean changePosition,boolean changeLook) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket(x,y,z,yaw,pitch,onGround,changePosition,changeLook); }
public double getY(double currentY) { return wrapperContained.getY(currentY); }
public double getX(double currentX) { return wrapperContained.getX(currentX); }
public float getPitch(float currentPitch) { return wrapperContained.getPitch(currentPitch); }
public float getYaw(float currentYaw) { return wrapperContained.getYaw(currentYaw); }
// public void apply() { wrapperContained.apply(); }
public boolean isOnGround() { return wrapperContained.isOnGround(); }
public double getZ(double currentZ) { return wrapperContained.getZ(currentZ); }
public boolean changesPosition() { return wrapperContained.changesPosition(); }
public boolean changesLook() { return wrapperContained.changesLook(); }

}