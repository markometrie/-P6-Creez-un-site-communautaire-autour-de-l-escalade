

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>${application.name}- A propos</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous" />

<!-- Chargement du fichier style.css -->
<link rel="stylesheet" href="resources/css/style.css" />
</head>
<body>
    
<!-- Inclusion du Header -->
<%@ include file="_include/header.jsp"%>

	
	
<!-- Formulaire -->
<div class="MiseFormulaire">
    <h1>Connexion</h1>

    <form method="post" action="inscription" class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email address :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="email" id="email" placeholder="Enter email" value="lotr_gandalf@gmail.com" />
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="nom">Nom :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="nom" id="nom" placeholder="Enter nom" value="lotr_gandalf" />
            </div>
        </div>
        
                <div class="form-group">
            <label class="control-label col-sm-2" for="prenom">Prenom :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="prenom" id="nom" placeholder="Enter prenom" value="lotr_gandalf" />
            </div>
        </div>
        
                <div class="form-group">
            <label class="control-label col-sm-2" for="pseudo">Pseudo :</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="pseudo" id="nom" placeholder="Enter pseudo" value="lotr_gandalf" />
            </div>
        </div>
        
                        <div class="form-group">
            <label class="control-label col-sm-2" for="motpasse">Password :</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" name="motpasse" id="nom" placeholder="motpasse" value="lotr_gandalf" />
            </div>
        </div>

<!-- Bouton se connecter -->
        <div class="form-group">
            <div class="BoutonFormu">
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"></span> se connecter</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>
