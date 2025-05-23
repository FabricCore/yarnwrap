package yarnwrap.data.advancement;
public class AdvancementTabGenerator { public net.minecraft.data.advancement.AdvancementTabGenerator wrapperContained; public AdvancementTabGenerator(net.minecraft.data.advancement.AdvancementTabGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public void accept(Object registries,java.util.function.Consumer exporter) { wrapperContained.accept(registries,exporter); }
// public static void accept(Object registries,java.util.function.Consumer exporter, ) { net.minecraft.data.advancement.AdvancementTabGenerator.accept(registries,exporter); }
// public yarnwrap.advancement.AdvancementEntry reference(java.lang.String id) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.reference(id)); }
// public static yarnwrap.advancement.AdvancementEntry reference(java.lang.String id, ) { return new yarnwrap.advancement.AdvancementEntry(net.minecraft.data.advancement.AdvancementTabGenerator.reference(id)); }

}