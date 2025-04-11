package yarnwrap.server.command;
public class SpawnArmorTrimsCommand { public net.minecraft.server.command.SpawnArmorTrimsCommand wrapperContained; public SpawnArmorTrimsCommand(net.minecraft.server.command.SpawnArmorTrimsCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ARMOR_PIECES() { return wrapperContained.ARMOR_PIECES; }
// public void ARMOR_PIECES(java.util.Map value) { wrapperContained.ARMOR_PIECES = value; }
// public java.util.List PATTERNS() { return wrapperContained.PATTERNS; }
// public void PATTERNS(java.util.List value) { wrapperContained.PATTERNS = value; }
// public java.util.List MATERIALS() { return wrapperContained.MATERIALS; }
// public void MATERIALS(java.util.List value) { wrapperContained.MATERIALS = value; }
// public java.util.function.ToIntFunction PATTERN_INDEX_GETTER() { return wrapperContained.PATTERN_INDEX_GETTER; }
// public void PATTERN_INDEX_GETTER(java.util.function.ToIntFunction value) { wrapperContained.PATTERN_INDEX_GETTER = value; }
// public java.util.function.ToIntFunction MATERIAL_INDEX_GETTER() { return wrapperContained.MATERIAL_INDEX_GETTER; }
// public void MATERIAL_INDEX_GETTER(java.util.function.ToIntFunction value) { wrapperContained.MATERIAL_INDEX_GETTER = value; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.execute(source.wrapperContained,player.wrapperContained); }

}