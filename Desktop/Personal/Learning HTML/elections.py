# Catherine Schwarzschild (cjs6nz)

dict = {}
# dict = {name: {candidate: votes}, }

def add_state(name, votes): #name is string, votes is dict {candidate: candidate_votes}
    ''' This function takes the name of a state and a dictionary called votes. The keys of votes is the name
    of the candidate and the values are the votes that that candidate recieved.

    This function updates the global dict with the name of the state as a key. The values for global dict are updated
    with a dictionary called election results. The keys in election results are the names of the candidates and
    the values are the number of votes that the candidate recieved.
    '''
    global dict
    election_results = {}
    for candidate in votes:
        candidate_votes = votes[candidate]
        election_results[candidate] = candidate_votes
    dict[name] = election_results


def winner(college): # college is a dict {name: total electoral votes}
    '''
    :param college: college is a dict with the key being the name of the state and the value being the
    total number of electoral votes assigned to that state
    :return: if there is a candidate with a majority of the votes, return candidate name. If no candidate recieved
    a majority, return "No Winner"
    '''
    global dict

    #This function calculates total electoral votes of the states
    electoral = 0
    
    elecList = {}
    for name in dict:
        elecList[name] = 0
    for state in college:
        elecList[state] = college[state]
        
    for name in dict:
        electoral += elecList[name]

    #Makes an dictionary to hold all electoral wins for each cantidate
    standings = {}
    for state in college:
        for cantidate in dict[name]:
            standings[cantidate] = 0

    for name in dict:
        totalVotes = 0
        for cantidate in dict[name]:
            totalVotes += dict[name][cantidate]
        for cantidate in dict[name]:
            if dict[name][cantidate] > totalVotes / 2:
                standings[cantidate] += elecList[name]

    for cantidate in standings:
        if (standings[cantidate] > electoral / 2):
            return cantidate

    return "No Winner"

def clear():
    global dict
    dict = {}

college = { 'Virginia': 13, 'Ohio': 18, 'Minnesota': 10, 'Alabama': 9, 'Maine': 4 }

print(winner({}))

add_state('Virginia', { 'Turing': 15, 'Lovelace': 20, 'Dijkstra': 10 })

add_state('Ohio', { 'Turing': 1, 'Dijkstra': 15 })

add_state('Alabama', { 'Turing': 10, 'Lovelace': 20, 'Dijkstra': 8 })

print(winner(college))

add_state('Minnesota', { 'Lovelace': 10, 'Dijkstra': 30, })

add_state('Florida', { 'Turing': 10, 'Lovelace': 30, 'Dijkstra': 15 })

print(winner(college))

clear()

add_state('Maine', { 'Turing': 2, 'Dijkstra': 1, 'Lovelace': 5 })

print(winner(college)) 



