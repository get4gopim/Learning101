package com.pod.examples;

import java.util.Optional;
import java.util.function.Consumer;

public class UserFacade {

    private UserRepo userRepo = new UserRepo();

    private UserMapper mapper = new UserMapper();

    public static void main(String[] args) {
        UserFacade main  = new UserFacade();
        main.displayUsers();
    }

    public String displayDiscounts(User user) {
        return  user.getMemberCard()
                .flatMap(card -> getDiscount(card))
                .map(d -> "Discounts%: " + d)
                .orElse("");
    }

    public Optional<Integer> getDiscount(MemberCard card) {
        if (card.getLoyaltyPoints() >= 60) {
            return Optional.of(5);
        }
        if (card.getLoyaltyPoints() >= 40) {
            return Optional.of(3);
        }
        return Optional.empty();
    }

    private void displayUsers() {
        Consumer<UserDto> consumer = x -> System.out.println(x);

        userRepo.findAllUsers().stream().map(mapper::toDto).forEach(consumer);

        System.out.println(displayDiscounts( new User(new MemberCard(60))) );
        System.out.println(displayDiscounts( new User(new MemberCard(40))) );

        System.out.println(displayDiscounts( new User()) );
    }
}
