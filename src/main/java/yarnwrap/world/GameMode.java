package yarnwrap.world;
public class GameMode { public net.minecraft.world.GameMode wrapperContained; public GameMode(net.minecraft.world.GameMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.world.GameMode.index; }
// public static void index(int value, ) { net.minecraft.world.GameMode.index = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.world.GameMode.id; }
// public static void id(java.lang.String value, ) { net.minecraft.world.GameMode.id = value; }

// public yarnwrap.world.GameMode DEFAULT() { return new yarnwrap.world.GameMode(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.world.GameMode value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.world.GameMode DEFAULT() { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.DEFAULT); }
// public static void DEFAULT(yarnwrap.world.GameMode value, ) { net.minecraft.world.GameMode.DEFAULT = value.wrapperContained; }

// public yarnwrap.text.Text simpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.simpleTranslatableName); }
// public void simpleTranslatableName(yarnwrap.text.Text value) { wrapperContained.simpleTranslatableName = value.wrapperContained; }
// public static yarnwrap.text.Text simpleTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.simpleTranslatableName); }
// public static void simpleTranslatableName(yarnwrap.text.Text value, ) { net.minecraft.world.GameMode.simpleTranslatableName = value.wrapperContained; }

// public yarnwrap.text.Text translatableName() { return new yarnwrap.text.Text(wrapperContained.translatableName); }
// public void translatableName(yarnwrap.text.Text value) { wrapperContained.translatableName = value.wrapperContained; }
// public static yarnwrap.text.Text translatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.translatableName); }
// public static void translatableName(yarnwrap.text.Text value, ) { net.minecraft.world.GameMode.translatableName = value.wrapperContained; }

// public int UNKNOWN() { return wrapperContained.UNKNOWN; }
// public void UNKNOWN(int value) { wrapperContained.UNKNOWN = value; }
// public static int UNKNOWN() { return net.minecraft.world.GameMode.UNKNOWN; }
// public static void UNKNOWN(int value, ) { net.minecraft.world.GameMode.UNKNOWN = value; }

// public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public static Object CODEC() { return net.minecraft.world.GameMode.CODEC; }
// // public static void CODEC(Object value, ) { net.minecraft.world.GameMode.CODEC = value; }

// public java.util.function.IntFunction INDEX_MAPPER() { return wrapperContained.INDEX_MAPPER; }
// public void INDEX_MAPPER(java.util.function.IntFunction value) { wrapperContained.INDEX_MAPPER = value; }
// public static java.util.function.IntFunction INDEX_MAPPER() { return net.minecraft.world.GameMode.INDEX_MAPPER; }
// public static void INDEX_MAPPER(java.util.function.IntFunction value, ) { net.minecraft.world.GameMode.INDEX_MAPPER = value; }

// public com.mojang.serialization.Codec INDEX_CODEC() { return wrapperContained.INDEX_CODEC; }
// public void INDEX_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INDEX_CODEC = value; }
public static com.mojang.serialization.Codec INDEX_CODEC() { return net.minecraft.world.GameMode.INDEX_CODEC; }
// public static void INDEX_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.GameMode.INDEX_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.world.GameMode.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.world.GameMode.PACKET_CODEC = value.wrapperContained; }

// // public GameMode(java.lang.String index,int id) { this.wrapperContained = new net.minecraft.world.GameMode(index,id); }
// public yarnwrap.world.GameMode byId(java.lang.String id,yarnwrap.world.GameMode fallback) { return new yarnwrap.world.GameMode(wrapperContained.byId(id,fallback.wrapperContained)); }
// public static yarnwrap.world.GameMode byId(java.lang.String id,yarnwrap.world.GameMode fallback, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byId(id,fallback.wrapperContained)); }
public int getIndex() { return wrapperContained.getIndex(); }
// public static int getIndex() { return net.minecraft.world.GameMode.getIndex(); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.world.GameMode.getId(); }
public void setAbilities(yarnwrap.entity.player.PlayerAbilities abilities) { wrapperContained.setAbilities(abilities.wrapperContained); }
// public static void setAbilities(yarnwrap.entity.player.PlayerAbilities abilities, ) { net.minecraft.world.GameMode.setAbilities(abilities.wrapperContained); }
public yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getTranslatableName()); }
// public static yarnwrap.text.Text getTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.getTranslatableName()); }
// public yarnwrap.world.GameMode byIndex(int index) { return new yarnwrap.world.GameMode(wrapperContained.byIndex(index)); }
// public static yarnwrap.world.GameMode byIndex(int index, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byIndex(index)); }
// public yarnwrap.world.GameMode byId(java.lang.String id) { return new yarnwrap.world.GameMode(wrapperContained.byId(id)); }
// public static yarnwrap.world.GameMode byId(java.lang.String id, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.byId(id)); }
public boolean isCreative() { return wrapperContained.isCreative(); }
// public static boolean isCreative() { return net.minecraft.world.GameMode.isCreative(); }
public boolean isBlockBreakingRestricted() { return wrapperContained.isBlockBreakingRestricted(); }
// public static boolean isBlockBreakingRestricted() { return net.minecraft.world.GameMode.isBlockBreakingRestricted(); }
public boolean isSurvivalLike() { return wrapperContained.isSurvivalLike(); }
// public static boolean isSurvivalLike() { return net.minecraft.world.GameMode.isSurvivalLike(); }
// public int getId(yarnwrap.world.GameMode gameMode) { return wrapperContained.getId(gameMode.wrapperContained); }
// public static int getId(yarnwrap.world.GameMode gameMode, ) { return net.minecraft.world.GameMode.getId(gameMode.wrapperContained); }
// public yarnwrap.world.GameMode getOrNull(int index) { return new yarnwrap.world.GameMode(wrapperContained.getOrNull(index)); }
// public static yarnwrap.world.GameMode getOrNull(int index, ) { return new yarnwrap.world.GameMode(net.minecraft.world.GameMode.getOrNull(index)); }
public yarnwrap.text.Text getSimpleTranslatableName() { return new yarnwrap.text.Text(wrapperContained.getSimpleTranslatableName()); }
// public static yarnwrap.text.Text getSimpleTranslatableName() { return new yarnwrap.text.Text(net.minecraft.world.GameMode.getSimpleTranslatableName()); }
// public boolean method_64759(int gameMode) { return wrapperContained.method_64759(gameMode); }
// public static boolean method_64759(int gameMode, ) { return net.minecraft.world.GameMode.method_64759(gameMode); }
// public boolean isValid(int index) { return wrapperContained.isValid(index); }
// public static boolean isValid(int index, ) { return net.minecraft.world.GameMode.isValid(index); }

}