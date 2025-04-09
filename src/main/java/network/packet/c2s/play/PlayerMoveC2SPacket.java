package yarnwrap.network.packet.c2s.play;
public class PlayerMoveC2SPacket { public net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained; public PlayerMoveC2SPacket(net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public double z() { return wrapperContained.z; }
// public float pitch() { return wrapperContained.pitch; }
// public double y() { return wrapperContained.y; }
// public float yaw() { return wrapperContained.yaw; }
// public boolean changeLook() { return wrapperContained.changeLook; }
// public double x() { return wrapperContained.x; }
// public boolean changePosition() { return wrapperContained.changePosition; }
// public boolean onGround() { return wrapperContained.onGround; }
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