# Приклад 2 Отримання значення private змінної
Як бачите, метод get() приймає об'єкт car, у якого ми хочемо запитати значення поля.

При виклику методу get() у serialNumber нам потрібно використовувати кастування (від англ - cast) т.к. метод get() повертає тип Object, але якщо ми знаємо тип, ми можемо скористатися цим і перетворити його до потрібного нам.