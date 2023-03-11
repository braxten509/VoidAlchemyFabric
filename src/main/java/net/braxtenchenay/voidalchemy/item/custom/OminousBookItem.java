package net.braxtenchenay.voidalchemy.item.custom;

import net.braxtenchenay.voidalchemy.world.dimension.ModDimension;
import net.fabricmc.fabric.api.dimension.v1.FabricDimensions;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OminousBookItem extends Item {
    public OminousBookItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("Very few things have ever frightened you,").formatted(Formatting.GRAY));
        tooltip.add(Text.literal("but this is one of those few things that has...").formatted(Formatting.GRAY));

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {

            user.getItemCooldownManager().set(this, 120);

            Vec3d playerBlockPos = new Vec3d(user.getX(), 200, user.getY());

            FabricDimensions.teleport(user, user.getServer().getWorld(ModDimension.VOID), new TeleportTarget(playerBlockPos, user.getVelocity(), user.getYaw(), user.getPitch()));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0));
        }

        if (world.isClient() && hand == Hand.MAIN_HAND) {
            user.sendMessage(Text.literal("You're afraid. Lost. Desperate. Hopeless...").formatted(Formatting.GRAY));
            user.sendMessage(Text.literal("But in the midst of darkness, there is always a ").formatted(Formatting.GRAY));
            user.sendMessage(Text.literal("L I G H T").formatted(Formatting.YELLOW));
        }

        return super.use(world, user, hand);
    }


}
