package yarnwrap.client.render.entity;
public class CamelEntityRenderer { public net.minecraft.client.render.entity.CamelEntityRenderer wrapperContained; public CamelEntityRenderer(net.minecraft.client.render.entity.CamelEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.entity.CamelEntityRenderer.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.entity.CamelEntityRenderer.TEXTURE = value.wrapperContained; }

// public CamelEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.entity.CamelEntityRenderer(ctx); }
// public yarnwrap.item.ItemStack method_66847(yarnwrap.client.render.entity.state.CamelEntityRenderState state) { return new yarnwrap.item.ItemStack(wrapperContained.method_66847(state.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_66847(yarnwrap.client.render.entity.state.CamelEntityRenderState state, ) { return new yarnwrap.item.ItemStack(net.minecraft.client.render.entity.CamelEntityRenderer.method_66847(state.wrapperContained)); }

}