package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test
    void torpedoCountTest() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        int result = store.getTorpedoCount();

        // Assert
        assertEquals(1, result);
    }
    @Test
    void torpedoIsEmptyTest() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(true, result);
    }
    @Test
    void torpedoIsNotEmptyTest() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.isEmpty();

        // Assert
        assertEquals(false, result);
    }
    @Test
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);


        // Assert
        assertThrows(IllegalArgumentException.class, () ->
        {boolean result = store.fire(1);});
    }
}
