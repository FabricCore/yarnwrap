package yarnwrap.network.packet.s2c.play;
public class GameStateChangeS2CPacket { public net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket wrapperContained; public GameStateChangeS2CPacket(net.minecraft.network.packet.s2c.play.GameStateChangeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float value() { return wrapperContained.value; }
// public Object reason() { return wrapperContained.reason; }
public Object NO_RESPAWN_BLOCK() { return wrapperContained.NO_RESPAWN_BLOCK; }
public Object RAIN_STARTED() { return wrapperContained.RAIN_STARTED; }
public Object RAIN_STOPPED() { return wrapperContained.RAIN_STOPPED; }
public Object GAME_MODE_CHANGED() { return wrapperContained.GAME_MODE_CHANGED; }
public Object GAME_WON() { return wrapperContained.GAME_WON; }
public Object DEMO_MESSAGE_SHOWN() { return wrapperContained.DEMO_MESSAGE_SHOWN; }
public Object PROJECTILE_HIT_PLAYER() { return wrapperContained.PROJECTILE_HIT_PLAYER; }
public Object RAIN_GRADIENT_CHANGED() { return wrapperContained.RAIN_GRADIENT_CHANGED; }
public Object THUNDER_GRADIENT_CHANGED() { return wrapperContained.THUNDER_GRADIENT_CHANGED; }
public Object PUFFERFISH_STING() { return wrapperContained.PUFFERFISH_STING; }
public Object ELDER_GUARDIAN_EFFECT() { return wrapperContained.ELDER_GUARDIAN_EFFECT; }
public Object IMMEDIATE_RESPAWN() { return wrapperContained.IMMEDIATE_RESPAWN; }
public int DEMO_OPEN_SCREEN() { return wrapperContained.DEMO_OPEN_SCREEN; }
public int DEMO_MOVEMENT_HELP() { return wrapperContained.DEMO_MOVEMENT_HELP; }
public int DEMO_JUMP_HELP() { return wrapperContained.DEMO_JUMP_HELP; }
public int DEMO_INVENTORY_HELP() { return wrapperContained.DEMO_INVENTORY_HELP; }
public int DEMO_EXPIRY_NOTICE() { return wrapperContained.DEMO_EXPIRY_NOTICE; }
public Object LIMITED_CRAFTING_TOGGLED() { return wrapperContained.LIMITED_CRAFTING_TOGGLED; }
public Object INITIAL_CHUNKS_COMING() { return wrapperContained.INITIAL_CHUNKS_COMING; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public Object getReason() { return wrapperContained.getReason(); }
public float getValue() { return wrapperContained.getValue(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}