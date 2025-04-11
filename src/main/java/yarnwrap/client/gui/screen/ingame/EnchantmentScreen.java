package yarnwrap.client.gui.screen.ingame;
public class EnchantmentScreen { public net.minecraft.client.gui.screen.ingame.EnchantmentScreen wrapperContained; public EnchantmentScreen(net.minecraft.client.gui.screen.ingame.EnchantmentScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier BOOK_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BOOK_TEXTURE); }
// public void BOOK_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BOOK_TEXTURE = value.wrapperContained; }
public float pageTurningSpeed() { return wrapperContained.pageTurningSpeed; }
public void pageTurningSpeed(float value) { wrapperContained.pageTurningSpeed = value; }
public float nextPageTurningSpeed() { return wrapperContained.nextPageTurningSpeed; }
public void nextPageTurningSpeed(float value) { wrapperContained.nextPageTurningSpeed = value; }
public float pageRotationSpeed() { return wrapperContained.pageRotationSpeed; }
public void pageRotationSpeed(float value) { wrapperContained.pageRotationSpeed = value; }
// public yarnwrap.client.render.entity.model.BookModel BOOK_MODEL() { return new yarnwrap.client.render.entity.model.BookModel(wrapperContained.BOOK_MODEL); }
// public void BOOK_MODEL(yarnwrap.client.render.entity.model.BookModel value) { wrapperContained.BOOK_MODEL = value.wrapperContained; }
public float approximatePageAngle() { return wrapperContained.approximatePageAngle; }
public void approximatePageAngle(float value) { wrapperContained.approximatePageAngle = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
public float nextPageAngle() { return wrapperContained.nextPageAngle; }
public void nextPageAngle(float value) { wrapperContained.nextPageAngle = value; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
public float pageAngle() { return wrapperContained.pageAngle; }
public void pageAngle(float value) { wrapperContained.pageAngle = value; }
public int ticks() { return wrapperContained.ticks; }
public void ticks(int value) { wrapperContained.ticks = value; }
// public net.minecraft.util.Identifier[] LEVEL_TEXTURES() { return wrapperContained.LEVEL_TEXTURES; }
// public void LEVEL_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.LEVEL_TEXTURES = value; }
// public net.minecraft.util.Identifier[] LEVEL_DISABLED_TEXTURES() { return wrapperContained.LEVEL_DISABLED_TEXTURES; }
// public void LEVEL_DISABLED_TEXTURES(net.minecraft.util.Identifier[] value) { wrapperContained.LEVEL_DISABLED_TEXTURES = value; }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_DISABLED_TEXTURE); }
// public void ENCHANTMENT_SLOT_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ENCHANTMENT_SLOT_DISABLED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE); }
// public void ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ENCHANTMENT_SLOT_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ENCHANTMENT_SLOT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ENCHANTMENT_SLOT_TEXTURE); }
// public void ENCHANTMENT_SLOT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ENCHANTMENT_SLOT_TEXTURE = value.wrapperContained; }
public EnchantmentScreen(yarnwrap.screen.EnchantmentScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.EnchantmentScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
public void doTick() { wrapperContained.doTick(); }
// public void drawBook(yarnwrap.client.gui.DrawContext context,int x,int y,float delta) { wrapperContained.drawBook(context.wrapperContained,x,y,delta); }

}