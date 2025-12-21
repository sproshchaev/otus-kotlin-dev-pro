import com.prosoft.User
import com.prosoft.user
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class UserTest {

    @Test
    fun `test create user with DSL`() {
        // Создаем пользователя с использованием DSL
        val user = user {
            name = "Иван Иванов"
            age = 30
            email = "ivan@example.com"
        }

        // Проверяем данные пользователя
        assertEquals("Иван Иванов", user.name)
        assertEquals(30, user.age)
        assertEquals("ivan@example.com", user.email)
    }

    @Test
    fun `test create user with infix DSL syntax`() {
        // Альтернативный синтаксис с инфиксной функцией
        val user = user {
            "name" to "Мария Петрова"
            "age" to 25
            "email" to "maria@example.com"
        }

        assertEquals("Мария Петрова", user.name)
        assertEquals(25, user.age)
        assertEquals("maria@example.com", user.email)
    }

    @Test
    fun `test user properties access with get operator`() {
        val user = User("Алексей", 35, "alex@example.com")

        // Используем оператор get для доступа к свойствам
        assertEquals("Алексей", user["name"])
        assertEquals(35, user["age"])
        assertEquals("alex@example.com", user["email"])
    }

    @Test
    fun `test user properties modification with set operator`() {
        val user = User("Ольга", 28, "olga@example.com")

        // Используем оператор set для изменения свойств
        user["name"] = "Ольга Сидорова"
        user["age"] = 29
        user["email"] = "olga.sidorova@example.com"

        assertEquals("Ольга Сидорова", user.name)
        assertEquals(29, user.age)
        assertEquals("olga.sidorova@example.com", user.email)
    }

    @Test
    fun `test DSL for creating test data`() {
        // Пример создания тестовых данных для различных сценариев
        val adminUser = user {
            name = "Администратор"
            age = 40
            email = "admin@system.com"
        }

        val guestUser = user {
            name = "Гость"
            age = 0
            email = "guest@system.com"
        }

        val invalidUser = user {
            name = ""
            age = -1
            email = "invalid-email"
        }

        // Тестируем разные сценарии
        assertTrue(adminUser.name.contains("Администратор"))
        assertEquals(0, guestUser.age)
        assertFalse(invalidUser.email.contains("@"))
    }

    @Test
    fun `test DSL in complex test scenario`() {
        // Создаем пользователей для теста системы
        val users = listOf(
            user {
                name = "Тест Пользователь 1"
                age = 20
                email = "test1@test.com"
            },
            user {
                name = "Тест Пользователь 2"
                age = 25
                email = "test2@test.com"
            },
            user {
                name = "Тест Пользователь 3"
                age = 30
                email = "test3@test.com"
            }
        )

        // Проверяем созданных пользователей
        assertEquals(3, users.size)
        assertTrue(users.all { it.email.contains("@") })
        assertEquals(25, users[1].age)

        // Используем оператор get для динамического доступа
        val firstUserName = users[0]["name"] as String
        assertTrue(firstUserName.contains("Тест"))
    }

}