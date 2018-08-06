/**
 * Aucune erreur n'est détectée dans ce code JavaScript.
 */
function parse(input) {
    output = "";
    for (var index = 0; index < input.length; index++) {
        output = output + input[index];
    }
    output = index;
    return output;
}

parse("abcdef");
parse(["abc", "def"]);