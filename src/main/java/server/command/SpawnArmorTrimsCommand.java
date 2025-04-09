package yarnwrap.server.command;
public class SpawnArmorTrimsCommand { public net.minecraft.server.command.SpawnArmorTrimsCommand wrapperContained; public SpawnArmorTrimsCommand(net.minecraft.server.command.SpawnArmorTrimsCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ARMOR_PIECES() { return wrapperContained.ARMOR_PIECES; }
// public java.util.List PATTERNS() { return wrapperContained.PATTERNS; }
// public java.util.List MATERIALS() { return wrapperContained.MATERIALS; }
// public java.util.function.ToIntFunction PATTERN_INDEX_GETTER() { return wrapperContained.PATTERN_INDEX_GETTER; }
// public java.util.function.ToIntFunction MATERIAL_INDEX_GETTER() { return wrapperContained.MATERIAL_INDEX_GETTER; }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int execute(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.execute(source.wrapperContained,player.wrapperContained); }

}