# JD2020-11-10.

### Подготовка:

<p><b>Посмотрите видео: <a href="https://youtu.be/mIs-X63CH78" target="_blank">Tutorial:QuickStart Idea 2017</a></b>
<p><b>Для IDEA 2020 и выше есть обновление: <a href="https://youtu.be/0Q8oADdp90Q" target="_blank">Tutorial:QuickStart 2020</a></b>
<p>Если вы чувствуете неуверенность посмотрите оба. Иначе хватит последнего.

### Начало работы:
1. Инициализация. Нажмите Fork на странице https://github.com/Khmelov/JD2020-11-10/
2. У вас в аккаунте fork появится тут  https://github.com/ваш_логин/JD2020-11-10
3. Выберите в IDEA VCS -> Checkout version control -> GitHub и затем:
 * укажите ссылку на Ваш fork https://github.com/ваш_логин/JD2020-11-10;
 * выберите путь к папке проекта (без русских букв и пробелов);
 * укажите имя папки проекта (например JD2020-11-10_verXX - такой папки на диске быть не должно).
 * после создания проекта добавьте **upstream** -> https://github.com/Khmelov/JD2020-11-10/ командой VCS -> Git -> Remotes...
 * если все сделано верно, то в окне Remotes будет два источника **origin** (ваш) и **upstream** (мой).

### Перед **каждым** сеансом работы:

1. Получите последние изменения основного репозитория VCS -> Git -> Pull (выберите upstream как источник)
2. Скопируйте папку jdXX__XX с заданиями и тестами (by.it._tasks_.jdXX__XX) в свою папку ((by.it.фамилия.jdXX__XX))
3. Отправьте эти изменения в свой репозиторий VCS -> Git -> Push

### Работаем с кодом:

1. Добавьте файлы ВСЕ java-файлы вашего пакета под контроль версий (Ctrl+Shift+A или VCS -> Git -> Add)
2. Работайте с кодом. Добейтесь чтобы проект собирался и запускался без ошибок.
3. Делайте коммиты Ctrl+K. _возврат на пункт 2 нужное число раз ;)_
4. Отправьте накопленные изменения в свой репозиторий VCS -> Git -> Push
5. Если работу нужно сдать, проверьте что проект собирается и запускается, затем можно сделать Pull Request. 
Лучше делать с сайта, но если у вас есть опыт работы с git, то можно и из среды VCS->Git->Create Pull Request
<br>_при Pull Request-е видно какие изменяются файлы. 
<br>В идеале должны быть изменения только в вашей папке_

### ВНИМАНИЕ!

Если проект невозможно скомпилировать из-за ошибок в чужих папках **НЕ ИСПРАВЛЯЙТЕ ИХ!**.
<br>Кто-то их тоже исправит и будет конфликт слияния на github.
<br>А как тогда сделать правильно? Просто отключите проблемную папку:
* выделите её в дереве проекта
* нажмите на ней правой кнопкой мыши
* Выполните команду **Mark Directory as -> Excluded**
* эта команда затронет только Ваш компьютер

Если все поломалось!
====================

Начать все заново нетрудно:

Найдите свою папку на диске, выделите ее в дереве папок в IDEA. Далее, правая кнопка -> Show in Explorer.
1. **Скопируйте** свою папку из src/by/it/ в отдельное место на диске (обязательно!).
2. Удалите fork из своего аккаунта github (откройте форк на сайте, выберите Setting-Delete this repository)
3. Выполните всю последовательность из шапки (см. <b>Начало работы</b>).
4. Верните свою папку на место в свежем проекте.
5. Делайте коммит Ctrl+K.
6. Отправьте накопленные изменения в свой репозиторий VCS -> Git -> Push

_С уважением, Александр Хмелев._