# TP4-partie1
Tout d'abord on a commencé par l'installation de:Note.js
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/00c3501d-8f27-4238-a46d-7bc4d3dd583d)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/4948ca0a-ae78-40c6-9446-05fe16c0eb7e)
Par la suite on ouvre le cmd et on exécute les commandes suivantes:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/ceced17e-db4d-426a-b7c4-2b8344c6bffe)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/054e7caf-be92-4dad-914d-774434216741)
Par la suite on effectue le téléchargement angular/cli
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/967bfc60-f31e-4bf3-8aec-0b6916a37dff)
Pour tcheker l'installation:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/35d99751-c19e-49c8-9308-8c80ef88272e)
Ensuite on crée un projet nommée:firstApp
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/9f3c370c-6036-4f2d-a984-92c0fd96b739)
En visitant le localhost:4200
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/8690a02f-8608-4c27-9278-00ed71889cf8)
lorsque le projet est crée on a un fichier nommée index.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/7976a694-146c-499b-a6aa-db7c09ced8e5)
Ensuite ce fichier fait appel au main.ts:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/97112d46-da39-4463-b405-88ae60abc921)
Ce dernier démarre un module s’appelle AppModule dans lequel on a les déclarations des composantes, on importe les modules, il y a les services et Bootstrap Component :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/b1368829-cb7c-4eed-b15d-76e47a73cd5b)
Maintenant, on va créer une application avec deux composants et avec un petit menu mais on doit utliser Bootstrap pour que ceci ca marche:
Ensuite dans app.component.html on a le contenu suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/80760050-d89e-49c6-8b58-f462e0808326)
En visitant le localhost on aura le résultat ci dessous :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/40d7df9f-c5a2-4338-8d5d-06aaac9dd62d)
Alors on souhaite cette fois ci que lorsqu'on  clique sur le bouton Home l'url doit changer a: /home et en cliquant sur le bouton Products l'url doit changer a :/products
Donc on commence par la création des deux composants , ensuite dans app.routing .module.ts:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/77075676-5407-4e9f-9ac1-dccc5aef71c2)
Et on va ajouter une petite modification dans app.component.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/3bbb625e-a517-4bb5-9d48-ca171446864a)
On aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/a28df7d1-6157-41aa-a782-d525933b9fc8)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/4384744f-9bba-4a2f-a586-a536862b43c0)
Ensuite en ajoutant cette petite modification dans app.component.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/f4494705-31e2-4e5f-b04b-12680cc6a782)
On aura le nouveau affichage:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c414cf07-e25f-40da-b3cf-a2c26aa1c754)
Donc dans home.component.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/55a17cf1-04ba-4aa6-9b6f-2acda78d641d)
On obtient le résutat suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/696d04ff-ab51-4c9f-ab90-b526c7dc8b6f)
On fera la meme chose pour products.component.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/0a1856ef-ffe3-450f-8f5e-eece8979130b)
On obtient le résutat suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/d862ea39-acec-499b-882b-1b83f18fa4cd)
Cette fois ci on veut afficher une liste de produits et avoir un bouton delete qui marche et le search afin de chercher des produits donc dans products.component.ts  on ajoute le contenu qui apparait dans le code ci dessous:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/845dae1a-6b50-4c2b-ad62-31e6c56a956f)
Et aussi dans products.component.ts le contenu qui apparait ci dessous: 
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/15efe2e6-f0d5-4555-acc3-8688ff945aa3)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/fdcd0217-5599-4853-83a3-2e56d9cd5f4d)
Cette fois ci on est chargé de faire une tache dont son but ultime c'est de marquer le bouton selectionné:
Pour cela dans le fichier app .component.html:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6aacfd63-7b37-497a-975f-090ccf87ef04)
Dans le fichier app.components.ts on ajoute ces modifications:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c17fe529-1b8b-445b-8137-668267a863a0)
Et au final on aura l'affichage suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/780a7bee-4c63-40bb-9dd3-532f79332ef0)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/da0cee18-06a5-49df-87ab-36f2b1d6b110)
# TP4-partie2
On commence par l importation de bootstrap dans le fichier styles.css:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/3a37e1d3-98da-4088-a35d-af462bf26424)















