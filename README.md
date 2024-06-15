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

TP4_partie2:
 Il faut commencer par ajouter des produits et handleCheckProduct function :
 ![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c93cb1d2-eac2-4788-a9b4-1e731984a879)
 Résultat :
 ![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/e41fab8c-80dc-4c93-8465-64587c8aa279)
 Installation de Json server et creation de la DB json :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6037e6c5-4972-46ab-993a-65b91b6bd149)
Après le lancement du json-server sur le port 8088 , lorsqu'on ajoute /products , on reçoie le résultat suivant : 
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/132beaa2-a25b-44d9-a11c-0d4505a8210d)
Ajout des fonctions pour handle check et handle Delete pour faire des modifications dans le backend et le front end:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/8226f302-9736-4a50-97ed-7d3c70989756)
 Voici l'apparition du Message de confirmation lors de la suppression:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/51d905f3-0b34-487a-aff9-810e608a2e66)
Apres la confirmation:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6d61e208-0e0d-4a9f-bfe7-ef158ace9375)
La recherche d'un produit :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/b8f9cfd7-539f-4cf9-aeb8-fd2addcdc462)
Part 2:
Modification de la fonctino getProducts pour qu'elle puisse prendre la réponse à partir de l'URL :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6750158c-05f5-4ac6-82ee-b42ffd885eb1)
Modification de getProducts pour recevoir le x-total-count pour savoir le nombre de pages (totalPages) :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/8e0dabb1-9156-4f9d-943a-44d6e5568bad)
On reçoit sur la console le nombre de x-total-count :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/4067114c-c922-44bf-85f0-25d415815431)
Utilisation de totalPages pour faire la pagination :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/b70ad722-a737-4935-84ad-da8d0235e90c)
Résultat de Pagination :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/f3bdcf10-2d7f-44cb-9379-ec9c246e9836)
Ajout d'un nouvelle component editProduct et function update pour pouvoir modifier un produit :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/cf0646cf-2adc-4bba-886a-5e2c5f2acf3e)
Après ajout de bouton et icone dans editProduct.html , on reçoit le résultat suivant :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/1d13e689-cc25-4147-9f25-5b096913a447)
lorsqu'on click sur l'edit d'un produit , on se retrouve dans le formulaire de modification et update :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6f1dca53-2e9d-4426-b78d-63dfec090a5d)
Part 3
Ajout du component dashboard :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/4c757f3a-3b67-43c7-a23e-4ec91c2a3a14)
Résultat :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/12547b87-5b90-41a6-8696-2dbe323dc389)
L'ajout de app-errors pour gérer les erreurs . Dans ce test ,nous avons arrété le json-server pour qu'on puisse voir l'erreur :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/bad5bc48-7074-4845-80d2-2b5f2703fa82)
Rendre la connexion un peu lent pour voir le spinner de chargement des produits :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6fab2b9d-784a-4b2f-8d79-62c9d2ddcb9e)

# TP4-partie3-video1
Le but ultime de cette troisieme partie: 
1.Créer les entités JPA
2.Créer les interfaces JPARepository basées sur Spring Data
3 . Générer des données aléatoires concernant quelques étudiants et pour chaque étudiants des payements
4. Créer une Web service RESTful (ResController) qui permet d'exposer les fonctionnalisés suivantes :
    - Consulter tous les payements
    - Consulter un payement sachant son id
    - Consulter les payemenst d'un type donné
    - Consulter les payements d'un status donné
    - Consulter les payements d'un étudiant donné
    - Consulter les payements d'une filière donnée
    - Consulter tous les étudiants
    - Consulter les étudiants d'une filière donnée
    - Consulter un étudiant sachant son code
    - Effectuer un nouveau payement avec les données et le reçu de payement au format pdf
    - Mettre à jour le status d'un payement
    - Consulter le reçu d'un payement  (fichier pdf) 
     5 - Tester le backend en utilisant un client REST (Postman) et avec SWAGGER UI
     6 - Faire un refactoring du code en utilisant la couche service, les DTOs et les Mappers
Tout d'abord on commence par créer un projet nommée:fsm-Demo-spring-angular et ajouter les dépendances nécessaires pour le travail
Ensuite on a crée divers packages: 
_entities pour les entités
_repository pour les repository
_service pour la couche service
_web pour la partie web
_security pour la partie sécurité
_dtos
Ensuite dans le package entities on a crée deux entités:Student et Payement
Commencant par la classe Student:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/d2921b79-3e9d-417f-8871-3af7eface653)
Ensuite on a la classe Payment:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/18448174-fbb8-45ef-a531-1fc44b85e949)
Et pour les deux types enumerate on aura donc:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/801ab5b3-8a2c-4715-890b-dc72e43e928f)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/5cd808c7-5789-4189-bd1b-5582274efd6e)
Par la suite on a crée a l'intérieur du package repository une interface nommée:StudentRepository
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/2689aa50-8173-41b7-aa7b-96e3992d2ac5)
Ainsi qu' a l'intérieur de ce package on a crée une interface qui va gérer les payments dont son nom est:PaymentRepository
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/245e62a8-1335-4185-8792-717b6ad73650)
Ensuite on va faire un test:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/06087cab-ae68-4a74-ad71-dcbd4521f5db)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/06d491b4-5bc9-4d2e-af8c-ae3a0f47d352)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/227ffe39-fd09-4994-8c67-d116537e0452)
Par la suite on a configuré la base:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/a5d71a85-93e9-4202-b5b7-3145475a7f2a)
Avant de faire le test on va créer un RestController on va le créer dans la partie web:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/a6cd9c9d-4759-4c6d-b761-56b6a99393f3)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/e7eff385-865c-4c39-8bb9-4c27b02a9b33)
En démarrant l'application on aura le résultat:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/38102698-cfec-4019-813e-2f0dfe89f57b)
En changeant l'url on obtient:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/111a4214-95cb-4582-bd68-9c08feb95555)
En faisant une autre fois un changement pour l'url on aura donc:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/6413dcf6-4a42-43e3-a57d-461d05bfa800)
Il existe un moyen beaucoup plus pratique pour tester les Api et Restfool c'est d'utiliser la documentation swager:
Donc il faut ajouter la dépendance ci dessous dans le fichier pom.xml:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/a7f8f3ab-0d3f-47dd-bfc3-b7478350b38c)
Ensuite en démarrant l'application une autre fois on aura un affichage qui ressemble a ceci:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c7edb18b-c611-4498-aff2-b1ba4f3f7de0)
On va tester get/students:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/0e76e7d8-7022-46d1-b1b9-89acd0f142a0)
On va tester get/studentsByProgrammId:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/7867fe72-0426-4b9c-9b7e-f2c3f165d453)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/9601343f-2a2d-4cd5-ac9a-ab93c2476524)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/11ad34de-5b8f-4997-8586-b07282213cb3)
Et par la suite on va créer une méthode qui permet de mettre a jour le status du paiement  :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/53a909e4-968b-4d32-8b16-8ecaf844ca21)
Par la suite on va tester:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/42ca572d-3f33-4083-b339-ee8e47b62a1a)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/55a763c0-4caa-4f63-91ca-7ae370c77627)
En consultant la base de donnée on trouve que:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/72418296-f2a8-44e9-97d7-0e8fe4272ebd)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/63ae4e74-4f62-4333-abb9-359b5b7ea0fd)
D'abord il faut faire la partie qui permet de faire l'ajout d'un paiement:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c4c4eab2-36bc-4bc1-98eb-3e3cc4705013)
On fait maintenant un test:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/61945bea-6f51-4124-a178-adfa4e17b985)
En cliquant sur Execute on aura le résultat suivant:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/2aa9c48c-208a-484b-a8fd-0825013eb5b3)
On bien recu a récuperer le fichier et a l'envoyer dans le bon endroit:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/f4f73627-144f-4801-885e-f233ccf19051)
On va créer une méthode qui va pouvoir consulter le fichier:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/d73dbd91-4a63-48e9-9500-6f213aee30ee)
En faisant un test on obtient donc:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/90e525f5-02cd-4821-a558-4607be5046b7)
Passant maintenant a la partie front end:
Alors dans la couche service on doit créer une classe nommée PaymentService:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/35c5ad0c-80fb-424c-8c1e-1c24420f4c60)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/10be67ad-3aff-4420-b574-d2afe5660921)
Et aussi y'aura un changement dans le controleur:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/39032cf1-4bea-4d28-acef-76d4ec1ec8b4)
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/316006dd-d0fd-4f9c-b4d7-9f37fca6376e)
Ensuite y'aura la création d'une classe dont son nom est:PaymentDTO.java
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/e28c895c-5131-4107-904f-a862b4fa1be2)

Partie3_Video2:
Ajout du projet angular dans notre projet et l'ajout d'angular material :
La creation d' une Nouvelle interface en utilisant angular et angular material :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/c2afe3b8-3ef0-4631-991b-a7958f498508)
Création du component Login pour effectuer l'authentification :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/bea34697-1d1b-4a4c-ab47-b18b09a3fd94)
Interface d'authentification :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/74a40bcd-887c-493e-94ea-f353d1a10308)
Authentification de l'admin :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/d557d1ec-895a-4328-928c-2705811ea15f)
Authentification de User1:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/8fc93ce3-a8cc-4f33-9eec-859f3f6bcd02)
Nouvelle vue de l'user1 (ne pas afficher le menu import ) :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/ad5166df-6295-49e3-a350-75a819bdc507)
Récupération des payments à partir du back-end :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/00e5ac11-d9bb-4ac9-b046-f7bddd400601)
Affichage dans payments.component.html en utilisant angular material:
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/a51dc4ee-587a-499b-9ccd-ffe7a9d6ad28)
Résultat :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/03839ce8-5d48-426d-8353-fb9f6c210929)
Interface finale après MatPaginator et MatSort :
![image](https://github.com/baayaouiimane/TP4-complet/assets/167249908/24eeb2c3-e4bf-465e-8b1c-7b49e7924212)


















